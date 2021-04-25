package cn.jimoos.form.payment;

import cn.jimoos.utils.form.AbstractUserForm4L;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author :keepcleargas
 * @date :2021-04-21 13:27.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayBussForm extends AbstractUserForm4L {
    /**
     * 订单号
     */
    private String orderNum;
    /**
     * 3 微信支付
     */
    private Integer payType;

    private String openId;
}
