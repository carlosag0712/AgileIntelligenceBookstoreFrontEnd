package io.agileintelligence.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by carlosarosemena on 2017-06-10.
 */
public class Authority implements GrantedAuthority {

    private String authority;

    public Authority(String authority) {
       this.authority = authority;
    }


    @Override
    public String getAuthority() {
        return authority;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

}
