package com.zeng.demo02;

public class UserServiceProxy implements UserService {
    public UserServiceProxy() {
    }

    private UserServiceImpl userServiceimpl;
    public void setUserServiceimpl(UserServiceImpl userServiceimpl) {
        this.userServiceimpl = userServiceimpl;
    }


    public void add() {
        log("add");
        userServiceimpl.add();
    }

    public void delete() {
        log("delete");
userServiceimpl.delete();
    }

    public void update() {
        log("uppdate");
     userServiceimpl.update();
    }

    public void select() {
        log("select");
        userServiceimpl.select();
    }
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
