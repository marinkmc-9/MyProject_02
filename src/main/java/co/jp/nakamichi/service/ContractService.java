package co.jp.nakamichi.service;

import java.util.List;//List

import org.springframework.stereotype.Service;//Service
import co.jp.nakamichi.entity.Contract;//entity
import co.jp.nakamichi.repository.ContractRepository;//repository

@Service
public class ContractService {
    private final ContractRepository contractRepository;

    public ContractService(ContractRepository repository) {
        this.contractRepository = repository;
    }

    /** 全件を検索して返す */
    public List<Contract> getContractList(){
        // リポジトリのfindAllメソッドを呼び出す
        return contractRepository.findAll();
    }
}
