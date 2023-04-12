/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoral;

import domain.Car;
import java.util.List;
import org.hibernate.Session;


public class CarDao {

    public void create(Car car) {
        Session ss = HibernateUtil.getSession();
        ss.beginTransaction();
        ss.save(car);
        ss.getTransaction().commit();
        ss.close();
    }

    public void delete(Car car) {
        Session ss = HibernateUtil.getSession();
        ss.beginTransaction();
        ss.delete(car);
        ss.getTransaction().commit();
        ss.close();
    }

    public void update(Car car) {
        Session ss = HibernateUtil.getSession();
        ss.beginTransaction();
        ss.update(car);
        ss.getTransaction().commit();
        ss.close();
    }

    public Car findByPlateNo(String plateNo) {
        Session ss = HibernateUtil.getSession();
        Car car = (Car) ss.get(Car.class, plateNo);
        ss.close();
        return car;
    }

    public List<Car> findAll() {
        Session ss = HibernateUtil.getSession();
        List<Car> carList = ss.createQuery("from Car a").list();
        ss.close();
        return carList;
    }
}
