package com.pbl5.autoattendance.embedded;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AuthorityId implements Serializable {
    private String username;
    private String authority;
}

