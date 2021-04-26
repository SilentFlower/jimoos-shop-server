package cn.jimoos.form;

import cn.jimoos.utils.form.AbstractAdminForm4L;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author :keepcleargas
 * @date 2021/04/26 14:46
 */
@Data
public class AdminDeleteForm extends AbstractAdminForm4L {
    @NotNull
    private Long toDeleteAdminId;
}
