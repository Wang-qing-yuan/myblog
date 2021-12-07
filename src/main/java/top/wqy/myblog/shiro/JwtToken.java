package top.wqy.myblog.shiro;


import org.apache.shiro.authc.AuthenticationToken;

/**
 * @description: JwtToken
 * @author: wqy
 * @date: 2021-12-07
 **/
public class JwtToken implements AuthenticationToken {

    private final String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
