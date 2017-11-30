package com.bdqn.bean;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_role_privilege
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SysRolePrivilege {

	/**
	 * Database Column Remarks: 角色ID This field was generated by MyBatis Generator. This field corresponds to the database column sys_role_privilege.role_id
	 * @mbg.generated
	 */
	private Long roleId;
	/**
	 * Database Column Remarks: 权限ID This field was generated by MyBatis Generator. This field corresponds to the database column sys_role_privilege.privilege_id
	 * @mbg.generated
	 */
	private Long privilegeId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role_privilege.role_id
	 * @return  the value of sys_role_privilege.role_id
	 * @mbg.generated
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role_privilege.role_id
	 * @param roleId  the value for sys_role_privilege.role_id
	 * @mbg.generated
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role_privilege.privilege_id
	 * @return  the value of sys_role_privilege.privilege_id
	 * @mbg.generated
	 */
	public Long getPrivilegeId() {
		return privilegeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role_privilege.privilege_id
	 * @param privilegeId  the value for sys_role_privilege.privilege_id
	 * @mbg.generated
	 */
	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}
}