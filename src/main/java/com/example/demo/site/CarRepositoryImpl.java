package com.example.demo.site;

import javax.persistence.Id;
import java.util.Optional;

public class CarRepositoryImpl implements CarRepository {
    @Override
    public <S extends Car> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Car> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Car> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Car> findAll() {
        return null;
    }

    @Override
    public Iterable<Car> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Car entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Car> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
