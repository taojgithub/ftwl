package com.ftwl.ltp.controller;

import com.ftwl.core.service.SerialNumberServiceUtil;
import com.ftwl.frame.context.GenericException;
import com.ftwl.frame.server.dao.BaseField;
import com.ftwl.frame.web.AjaxResult;
import com.ftwl.frame.web.BaseController;
import com.ftwl.frame.web.PageData;
import com.ftwl.frame.web.resolve.BodyParam;
import com.ftwl.ltp.model.enums.LtpSerialNumberPrefixEnum;
import com.ftwl.ltp.model.field.OrderField;
import com.ftwl.ltp.model.req.OrderSaveReq;
import com.ftwl.ltp.service.OrderService;
import com.ftwl.ltp.model.entity.Order;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.SecurityContextProvider;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* @author autoCoder
* @since 2018-03-04 16:53:36
*/
@Controller
@RestController
@RequestMapping("order")
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    /**
    * 新增
    * @param req
    * @return
    */
    @RequestMapping("add")
    public AjaxResult<Order> add(@RequestBody @Validated OrderSaveReq req) {
        Order entity = req.getEntity();

        entity.setOrderSn(SerialNumberServiceUtil.getSerialNumber(LtpSerialNumberPrefixEnum.ORDER));

        orderService.insert(entity);
        return successResult(entity);
    }

    /**
    * 更新 Code
    * @param id, code
    * @return
    */
    @RequestMapping("updateCode")
    @BodyParam
    public AjaxResult<Order> updateCode(String id, String code) {
        Order entity = new Order();
        entity.setId(id);
        entity.setCode(code);
        orderService.updateField(entity, OrderField.update().code());
        return successResult(orderService.get(id));
    }

    /**
    * 删除
    * @param id
    * @return
    */
    @RequestMapping("delete")
    @BodyParam
    public AjaxResult delete(String id) {
        orderService.delete(id);
        return successResult(id);
    }



    /**
    * 获取单个信息
    * @param id
    * @return
    */
    @RequestMapping("get")
    @BodyParam
    public AjaxResult<Order> get(String id) {
        if (StringUtils.isBlank(id)) {
            throw new GenericException("ID不可为空");
        }
        Order order = orderService.get(id);
        return successResult(order);
     }

    /**
     * 获取单个信息
     * @param entity
     * @return
     */
    @RequestMapping("list")
    public AjaxResult<PageData<Order>> list(@RequestBody Order entity) {

        baseAppointPageSqlId("OrderBaseDao.listByEntity");

        List<Order> list = orderService.listByEntity(entity);
        return successPageResult(list);
    }

    /**
     * 获取单个信息
     * @param entity
     * @return
     */
    @RequestMapping("listOrder")
    public AjaxResult<PageData<Order>> listOrder(@RequestBody Order entity) {

        baseAppointPageSqlId("OrderDao.listOrder");

        List<Order> list = orderService.listOrder(entity.getName());
        return successPageResult(list);
    }
}
