package com.gitee.search.core;

/**
 * 搜索相关常量定义
 * @author Winter Lau<javayou@gmail.com>
 */
public interface Constants {

    byte RECOMM_NONE    = 0x00; //未被推荐项目（推荐级别定义必须递增）
    byte RECOMM         = 0x01; //推荐项目
    byte RECOMM_GVP     = 0x02; //GVP推荐项目

    byte REPO_TYPE_PRIVATE  = 0x00; //私有仓库
    byte REPO_TYPE_PUBLIC   = 0x01; //公开仓库
    byte REPO_TYPE_INNER    = 0x02; //企业内源仓库

    byte REPO_BLOCK_YES = 0x01;
    byte REPO_BLOCK_NO = 0x00;

    byte REPO_FORK_NO = 0x00;
    byte REPO_FORK_YES = 0x01;

    byte ISSUE_PUBLIC = 1;


    String FIELD_LANGUAGE       = "lang";
    String FIELD_REPO_ID        = "repo.id";
    String FIELD_REPO_NAME      = "repo.name";
    String FIELD_REPO_URL       = "repo.url";
    String FIELD_FILE_NAME      = "file.name";
    String FIELD_FILE_LOCATION  = "file.location";

    String FIELD_CODE_OWNER     = "owner";
    String FIELD_FILE_HASH      = "file.hash";
    String FIELD_CONTENTS       = "source";

    String FIELD_LAST_INDEX     = "modified";
    String FIELD_REVISION       = "revision";
    String FIELD_SCM            = "scm";

}
