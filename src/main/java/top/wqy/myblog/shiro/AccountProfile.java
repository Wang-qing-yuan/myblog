package top.wqy.myblog.shiro;


import lombok.Data;

import java.io.Serializable;

/**
 * @description: 登陆账号类
 * @author: wqy
 * @date: 2021-12-07
 **/
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}
