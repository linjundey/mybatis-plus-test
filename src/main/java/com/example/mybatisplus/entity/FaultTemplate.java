package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName fault_template
 */
@TableName(value ="fault_template")
@Data
public class FaultTemplate implements Serializable {
    /**
     * 
     */
    @TableId()
    private Integer id;

    /**
     * 
     */
    private LocalDateTime gmtCreate;

    /**
     * 
     */
    private LocalDateTime gmtUpdate;

    /**
     * 
     */
    private String templateCode;

    /**
     * 
     */
    private String templateName;

    /**
     * 
     */
    private String cmdType;

    /**
     * 
     */
    private String cmdContent;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}