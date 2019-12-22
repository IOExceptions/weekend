package com.weekend.common.module.model.sys;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 数据字典
 * </p>
 *
 * @author WangZhiKun
 * @since 2019-12-22
 */
public class SysDict extends Model<SysDict> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;
    /**
     * 模块ID
     */
    private Long moudleId;
    /**
     * 排序
     */
    private Integer showOrder;
    /**
     * 父字典
     */
    private Long parentId;
    /**
     * 类型名
     */
    private String typeName;
    /**
     * 代码
     */
    private String code;
    /**
     * 名字
     */
    private String name;
    /**
     * 名称6
     */
    private String name6;
    /**
     * 名称5
     */
    private String name5;
    /**
     * 名称4
     */
    private String name4;
    /**
     * 名称3
     */
    private String name3;
    /**
     * 名称2
     */
    private String name2;
    /**
     * 值
     */
    private String value;
    /**
     * 备注
     */
    private String remark;
    /**
     * 父对象
     */
    private String parentIds;
    /**
     * 孩子数
     */
    private Integer childNums;
    /**
     * 第二列值
     */
    private String value2;
    /**
     * 是否系统
     */
    private Integer isSystem;
    /**
     * 业务类型（用于区分具体业务、大部分公用，只有个别区别）
     */
    private String businessType;
    /**
     * 是否移动端显示
     */
    private String isAppShow;
    /**
     * 是否网页端显示
     */
    private String isWebShow;
    /**
     * 数据来源类型（默认0-系统、1-导入）
     */
    private String dataSourceType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMoudleId() {
        return moudleId;
    }

    public void setMoudleId(Long moudleId) {
        this.moudleId = moudleId;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName6() {
        return name6;
    }

    public void setName6(String name6) {
        this.name6 = name6;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public Integer getChildNums() {
        return childNums;
    }

    public void setChildNums(Integer childNums) {
        this.childNums = childNums;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public Integer getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getIsAppShow() {
        return isAppShow;
    }

    public void setIsAppShow(String isAppShow) {
        this.isAppShow = isAppShow;
    }

    public String getIsWebShow() {
        return isWebShow;
    }

    public void setIsWebShow(String isWebShow) {
        this.isWebShow = isWebShow;
    }

    public String getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysDict{" +
        ", id=" + id +
        ", moudleId=" + moudleId +
        ", showOrder=" + showOrder +
        ", parentId=" + parentId +
        ", typeName=" + typeName +
        ", code=" + code +
        ", name=" + name +
        ", name6=" + name6 +
        ", name5=" + name5 +
        ", name4=" + name4 +
        ", name3=" + name3 +
        ", name2=" + name2 +
        ", value=" + value +
        ", remark=" + remark +
        ", parentIds=" + parentIds +
        ", childNums=" + childNums +
        ", value2=" + value2 +
        ", isSystem=" + isSystem +
        ", businessType=" + businessType +
        ", isAppShow=" + isAppShow +
        ", isWebShow=" + isWebShow +
        ", dataSourceType=" + dataSourceType +
        "}";
    }
}
