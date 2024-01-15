package cn.hallie.hframe.base;

import cn.hallie.hframe.common.utils.SnowFlakeUtil;
import cn.hallie.hframe.common.constant.Constant;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Hallie
 * @date 2024-01-12
 */
@Data
public abstract class HframeBaseModel implements Serializable {
    @Id
    @TableId
    @ApiModelProperty(value = "雪花算法生成唯一标识")
    private String id = SnowFlakeUtil.nextId().toString();

    @ApiModelProperty(value = "创建者")
    @CreatedBy
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    @CreatedDate
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新者")
    @LastModifiedBy
    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;

    @LastModifiedDate
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "逻辑删除标志 默认0 表示未删除")
    private Integer delFlag = Constant.LOGICAL_DEL_FALSE;
}
