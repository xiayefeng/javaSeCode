package com.atguigu02.singlenton;

public class GirlFriendTest{
    public static void main(String[] args) {

    }
}

//懒汉模式
class GirlFriend {
    private GirlFriend(){

    }

    private static GirlFriend instance = null;

    public static GirlFriend getInstance() {
        if(instance == null) {
            instance = new GirlFriend();
            return  instance;
        }
        return instance;
    }

}
