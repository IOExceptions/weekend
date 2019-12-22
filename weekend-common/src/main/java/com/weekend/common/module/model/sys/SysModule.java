package com.weekend.common.module.model.sys;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 模块表(sys_module)
 * </p>
 *
 * @author WangZhiKun
 * @since 2019-12-22
 */
public class SysModule extends Model<SysModule> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;
    /**
     * 模块名
     */
    private String name;
    /**
     * 模块代码
     */
    private String code;
    /**
     * 是否是系统模块
     */
    private String isSystem;
    /**
     * 上级模块
     */
    private Long parentId;
    /**
     * 关联数据表
     */
    private Long tableId;
    /**
     * 启用状态
     */
    private String start;
    /**
     * 创建人
     */
    private String createName;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 创建者id
     */
    private Long createId;
    /**
     * 修改人
     */
    private String modifierName;
    /**
     * 修改时间
     */
    private Date modifierDate;
    /**
     * 修改者id
     */
    private Long modifierId;
    /**
     * 是否是树
     */
    private String isTree;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public Date getModifierDate() {
        return modifierDate;
    }

    public void setModifierDate(Date modifierDate) {
        this.modifierDate = modifierDate;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public String getIsTree() {
        return isTree;
    }

    public void setIsTree(String isTree) {
        this.isTree = isTree;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysModule{" +
        ", id=" + id +
        ", name=" + name +
        ", code=" + code +
        ", isSystem=" + isSystem +
        ", parentId=" + parentId +
        ", tableId=" + tableId +
        ", start=" + start +
        ", createName=" + createName +
        ", createDate=" + createDate +
        ", createId=" + createId +
        ", modifierName=" + modifierName +
        ", modifierDate=" + modifierDate +
        ", modifierId=" + modifierId +
        ", isTree=" + isTree +
        "}";
    }
}
