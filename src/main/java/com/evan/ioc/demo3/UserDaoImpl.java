package com.evan.ioc.demo3;

public class UserDaoImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("查询");
    }

    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }
}
