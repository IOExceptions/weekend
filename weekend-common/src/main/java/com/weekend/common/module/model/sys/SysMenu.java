package com.weekend.common.module.model.sys;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * sys_menu
 * </p>
 *
 * @author WangZhiKun
 * @since 2019-12-19
 */
public class SysMenu extends Model<SysMenu> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;
    /**
     * 上级菜单
     */
    private Long parentId;
    /**
     * 父亲
     */
    private String parentIds;
    /**
     * 模块
     */
    private Long moduleId;
    /**
     * 代码
     */
    private String code;
    /**
     * 菜单类别
     */
    private String menuType;
    /**
     * name6
     */
    private String name6;
    /**
     * name5
     */
    private String name5;
    /**
     * name4
     */
    private String name4;
    /**
     * name3
     */
    private String name3;
    /**
     * 英文名称
     */
    private String name2;
    /**
     * 名称
     */
    private String name;
    /**
     * 拼音
     */
    private String spellCode;
    /**
     * 图标
     */
    private String icon;
    /**
     * url
     */
    private String url;
    /**
     * 排序
     */
    private Integer showOrder;
    /**
     * 层次
     */
    private Integer depth;
    /**
     * 状态
     */
    private String status;
    /**
     * 系统菜单
     */
    private String isSystem;
    /**
     * 创建人
     */
    private Long creator;
    /**
     * 创建日期
     */
    private Date createdate;
    /**
     * 修改人
     */
    private Long modifier;
    /**
     * 修改日期
     */
    private Date modifiedtime;
    /**
     * 公司
     */
    private Long companyId;
    /**
     * 资源
     */
    private Long resourceId;
    /**
     * 孩子数
     */
    private Integer childNums;
    /**
     * 是否自助
     */
    private Integer isSelf;
    /**
     * 是否显示
     */
    private Integer isShow;
    /**
     * 数据来源类型（默认0-系统、1-导入）
     */
    private String dataSourceType;

    @TableField(exist = false)
    private List<SysMenu> childNodes;



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

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getChildNums() {
        return childNums;
    }

    public void setChildNums(Integer childNums) {
        this.childNums = childNums;
    }

    public Integer getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Integer isSelf) {
        this.isSelf = isSelf;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
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
        return "SysMenu{" +
        ", id=" + id +
        ", parentId=" + parentId +
        ", parentIds=" + parentIds +
        ", moduleId=" + moduleId +
        ", code=" + code +
        ", menuType=" + menuType +
        ", name6=" + name6 +
        ", name5=" + name5 +
        ", name4=" + name4 +
        ", name3=" + name3 +
        ", name2=" + name2 +
        ", name=" + name +
        ", spellCode=" + spellCode +
        ", icon=" + icon +
        ", url=" + url +
        ", showOrder=" + showOrder +
        ", depth=" + depth +
        ", status=" + status +
        ", isSystem=" + isSystem +
        ", creator=" + creator +
        ", createdate=" + createdate +
        ", modifier=" + modifier +
        ", modifiedtime=" + modifiedtime +
        ", companyId=" + companyId +
        ", resourceId=" + resourceId +
        ", childNums=" + childNums +
        ", isSelf=" + isSelf +
        ", isShow=" + isShow +
        ", dataSourceType=" + dataSourceType +
        "}";
    }

    public List<SysMenu> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<SysMenu> childNodes) {
        this.childNodes = childNodes;
    }
}
