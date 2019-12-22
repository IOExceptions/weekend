package com.weekend.common.module.model.sys;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 模块分类表(sys_module_catalog)
 * </p>
 *
 * @author WangZhiKun
 * @since 2019-12-22
 */
public class SysModuleCatalog extends Model<SysModuleCatalog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;
    /**
     * 父id
     */
    private Long parentId;
    /**
     * 是否删除
     */
    private String isDelete;
    /**
     * 标签名
     */
    private String name;
    /**
     * 图标
     */
    private String icon;
    /**
     * 类别
     */
    private String type;
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
     * 物理表分类(1.导入 2.系统创建)
     */
    private String tableClass;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getTableClass() {
        return tableClass;
    }

    public void setTableClass(String tableClass) {
        this.tableClass = tableClass;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysModuleCatalog{" +
        ", id=" + id +
        ", parentId=" + parentId +
        ", isDelete=" + isDelete +
        ", name=" + name +
        ", icon=" + icon +
        ", type=" + type +
        ", createName=" + createName +
        ", createDate=" + createDate +
        ", createId=" + createId +
        ", modifierName=" + modifierName +
        ", modifierDate=" + modifierDate +
        ", modifierId=" + modifierId +
        ", tableClass=" + tableClass +
        "}";
    }
}
