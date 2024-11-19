package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Result;

public interface ResultRepository extends JpaRepository<Result, String> {
}