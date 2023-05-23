package mvcProject.repository;

import mvcProject.entity.House;

import java.util.List;

public interface HouseRepository {
    void  saveHouse(House house);

    List<House> getAllHouses();

    House getHouseById(Long id);

    String updateHouseById(Long id, House house);

    void  deleteHouse(Long id);




}
