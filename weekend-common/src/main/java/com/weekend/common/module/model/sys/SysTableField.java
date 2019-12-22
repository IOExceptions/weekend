package com.weekend.common.module.model.sys;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 表字段(sys_table)
 * </p>
 *
 * @author WangZhiKun
 * @since 2019-12-22
 */
@Data
public class SysTableField extends Model<SysTableField> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;
    /**
     * 字段名
     */
    private String name;
    /**
     * 代码
     */
    private String code;
    /**
     * 输入类型(1.文本框 2.密码框 3.单选 4.多选 5.日期 6.日期时间 7.文件 8.文本域  )
     */
    private String inputType;
    /**
     * 是否验证
     */
    private String isVerify;
    /**
     * 列表显示
     */
    private String listShow;
    /**
     * 表单显示
     */
    private String formShow;
    /**
     * 查看模式显示
     */
    private String viewShow;
    /**
     * 编辑模式显示
     */
    private String editShow;
    /**
     * 备注
     */
    private String commentText;
    /**
     * 字段类型（1.字符串 2.大数字 3.数字类型 4.日期类型 5.日期时间 6.长文本类型 7. 8. 9. 10.）
     */
    private String type;
    /**
     * 字段长度
     */
    private Integer length;
    /**
     * 是否删除
     */
    private String isDelete;
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
     * 是否是参照
     */
    private String isRefer;
    /**
     * 参照类型
     */
    private String referType;
    /**
     * 数据字典
     */
    private String dictCode;
    /**
     * 参照表名
     */
    private String referTableName;
    /**
     * 参照字段id
     */
    private Long referTableFieldId;
    /**
     * 是否同步到数据库
     */
    private String isSynchronization;
    /**
     * 数据表ID
     */
    private Long tableId;


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

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(String isVerify) {
        this.isVerify = isVerify;
    }

    public String getListShow() {
        return listShow;
    }

    public void setListShow(String listShow) {
        this.listShow = listShow;
    }

    public String getFormShow() {
        return formShow;
    }

    public void setFormShow(String formShow) {
        this.formShow = formShow;
    }

    public String getViewShow() {
        return viewShow;
    }

    public void setViewShow(String viewShow) {
        this.viewShow = viewShow;
    }

    public String getEditShow() {
        return editShow;
    }

    public void setEditShow(String editShow) {
        this.editShow = editShow;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
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

    public String getIsRefer() {
        return isRefer;
    }

    public void setIsRefer(String isRefer) {
        this.isRefer = isRefer;
    }

    public String getReferType() {
        return referType;
    }

    public void setReferType(String referType) {
        this.referType = referType;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getReferTableName() {
        return referTableName;
    }

    public void setReferTableName(String referTableName) {
        this.referTableName = referTableName;
    }

    public Long getReferTableFieldId() {
        return referTableFieldId;
    }

    public void setReferTableFieldId(Long referTableFieldId) {
        this.referTableFieldId = referTableFieldId;
    }

    public String getIsSynchronization() {
        return isSynchronization;
    }

    public void setIsSynchronization(String isSynchronization) {
        this.isSynchronization = isSynchronization;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysField{" +
        ", id=" + id +
        ", name=" + name +
        ", code=" + code +
        ", inputType=" + inputType +
        ", isVerify=" + isVerify +
        ", listShow=" + listShow +
        ", formShow=" + formShow +
        ", viewShow=" + viewShow +
        ", editShow=" + editShow +
        ", commentText=" + commentText +
        ", type=" + type +
        ", length=" + length +
        ", isDelete=" + isDelete +
        ", createName=" + createName +
        ", createDate=" + createDate +
        ", createId=" + createId +
        ", modifierName=" + modifierName +
        ", modifierDate=" + modifierDate +
        ", modifierId=" + modifierId +
        ", isRefer=" + isRefer +
        ", referType=" + referType +
        ", dictCode=" + dictCode +
        ", referTableName=" + referTableName +
        ", referTableFieldId=" + referTableFieldId +
        ", isSynchronization=" + isSynchronization +
        "}";
    }
}
