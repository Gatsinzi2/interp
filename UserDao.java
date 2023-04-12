/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoral;

import domain.User;
import java.util.List;
import org.hibernate.Session;


public class UserDao {

    public void create(User user) {
        Session ss = HibernateUtil.getSession();
        ss.beginTransaction();
        ss.save(user);
        ss.getTransaction().commit();
        ss.close();
    }

    public void delete(User user) {
        Session ss = HibernateUtil.getSession();
        ss.beginTransaction();
        ss.delete(user);
        ss.getTransaction().commit();
        ss.close();
    }

    public void update(User user) {
        Session ss = HibernateUtil.getSession();
        ss.beginTransaction();
        ss.update(user);
        ss.getTransaction().commit();
        ss.close();
    }

    public User findByUsername(String username) {
        Session ss = HibernateUtil.getSession();
        User user = (User) ss.get(User.class, username);
        ss.close();
        return user;
    }

    public List<User> findAll() {
        Session ss = HibernateUtil.getSession();
        List<User> userList = ss.createQuery("from User a").list();
        ss.close();
        return userList;
    }
}
