package com.sylinx.security.distributed.uaa;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class TestBCrypt {



    public static void main(String [] args) {
        String abc = BCrypt.hashpw("secret", BCrypt.gensalt());
        System.out.println(abc);
        System.out.println(BCrypt.checkpw("secret", abc));

    }
}
