package dao;

import model.City;

import java.util.List;

public interface CityDao {
    void create(City city);
    void update(City city);
    void delete(City city);
    City readById(int id);
    List<City> readAll();
}
