package co.jp.nakamichi.repository;

import org.springframework.data.jpa.repository.JpaRepository;//JpaRepository
import co.jp.nakamichi.entity.Contract;//entity

public interface ContractRepository extends JpaRepository<Contract,Integer>{

}
