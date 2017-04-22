package project.common;

public class Contants {
	public static final String TAB_ACCOUNT = "Account"; // 1
	public static final String TAB_PROJECT = "Project"; // 2
	public static final String TAB_PROJECT_OF_ACCOUNT = "ProjectOfAccount"; // 3
	public static final String TAB_STORY = "Story"; // 4
	public static final String TAB_TASK = "Task"; // 5
	public static final String TAB_COMMENT = "Comment"; // 6
	public static final String TAB_PERSON = "Person"; // 7

	// Contants variable field in database
	public static final String COL_PROJECTID = "projectId"; // 1
	public static final String COL_ACCOUNTID = "accountId"; // 2
	public static final String COL_PROJECTNAME = "projectName"; // 3
	public static final String COL_USERNAME = "username"; // 4
	public static final String COL_PASSWORD = "password"; // 5
	public static final String COL_ROLE = "role"; // 6
	public static final String COL_ISACTIVE = "isActive"; // 7
	public static final String COL_PERSONID = "personId"; // 8
	public static final String COL_FULLNAME = "fullname"; // 9
	public static final String COL_AVATAR = "avatar"; // 10
	public static final String COL_STATUS = "status"; // 11
	public static final String COL_BIRTHDAY = "birthday"; // 12
	public static final String COL_STORYID = "storyId"; // 13
	public static final String COL_STORYCONTENT = "storyContent"; // 14
	public static final String COL_DATECREATE = "dateCreate"; // 15
	public static final String COL_TASKID = "taskId"; // 16
	public static final String COL_TASKNAME = "taskName"; // 17
	public static final String COL_DATESTART = "dateStart"; // 18
	public static final String COL_DATEEND = "dateEnd"; // 19
	public static final String COL_DESCRIPTION = "description"; // 20
	public static final String COL_COMMENTID = "commentId"; // 21
	public static final String COL_COMMENTCONTENT = "commentContent"; // 22

	public static final String SES_EXIST_SESSION = "exist_session";
	public static final String SES_NOT_EXIST_SESSION = "not_exist_session";
	
	public static final String SES_NOT_ADMIN_SESSION = "not_admin_session";
	public static final String SES_IS_ADMIN_SESSION = "is_admin_session";
	
	public static final String SES_NOT_MODIFIER_SESSION = "not_modifier_session";
	public static final String SES_IS_MODIFIER_SESSION = "is_modifier_session";
	
	public static final String SES_NOT_NORMAL_SESSION = "not_mormal_session";
	public static final String SES_IS_NORMAL_SESSION = "is_mormal_session";
	
	public static final String SES_NOT_GUEST_SESSION = "not_guest_session";
	public static final String SES_IS_GUEST_SESSION = "is_guest_session";
	
	public static final String SES_NOT_UNKNOWN_SESSION = "not_unknown_session";
	public static final String SES_IS_UNKNOWN_SESSION = "is_unknown_session";
	
	public static final String ACC_NOT_ACTIVE = "account_not_active";
	public static final String ACC_IS_ACTIVE = "account_is_active";
	
	public static final String KEY_MAP_SESSION_ROLE = "role";
	public static final String KEY_MAP_SESSION_IS_ACTIVE = "isActive";
	public static final String KEY_MAP_SESSION_USERNAME = "username";
	public static final String KEY_MAP_SESSION_PERSON_ID = "personId";
	public static final String KEY_MAP_SESSION_ACCOUNT_ID = "accountId";
	
	public static final String LOGIN_EXIST = "login_exist";
	public static final String SHOW_lOGIN = "show_login";
	public static final String ERROR_SHOW_lOGIN = "error_show_login";
	public static final String NOT_ADMIN = "not_admin";
	public static final String IS_ADMIN = "is_admin";
}
