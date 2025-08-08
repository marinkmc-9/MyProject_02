package co.jp.nakamichi.controller;

import org.springframework.stereotype.Controller;//Controller
import org.springframework.ui.Model;//Model
import org.springframework.web.bind.annotation.GetMapping;//GetMapping
import org.springframework.web.bind.annotation.ModelAttribute;//ModelAttribute
import org.springframework.web.bind.annotation.PathVariable;//PathVariable
import org.springframework.web.bind.annotation.PostMapping;//PostMapping
import org.springframework.web.bind.annotation.RequestMapping;//RequestMapping

import co.jp.nakamichi.entity.Contract;//entity
import co.jp.nakamichi.service.ContractService;//Service

@Controller
@RequestMapping("contract")
public class ContractController {
    private final ContractService service;

    public ContractController(ContractService service) {
        this.service = service;
    }

    /** 一覧画面を表示*/
    @GetMapping("/list")
    public String getList(Model model) {
        // 全件検索結果をModelに登録
        model.addAttribute("contractlist",service.getContractList());
        // contract/list.htmlに画面遷移
        return "contract/list";
    }

    /** Contract登録画面を表示 */
    @GetMapping("/register")
    public String getRegister(@ModelAttribute Contract contract) {
        // Contract登録画面に遷移
        return "contract/register";

    }

    /** Contract登録処理 */
    @PostMapping ("/register")
    public String postRegister(Contract contract) {
        //Contract登録
        service.saveContract(contract);
        //一般画面にリダイレクト
        return "redirect:/contract/list";
    }

    //----追加：ここから----
    /**Contract更新画面を表示 */
    @GetMapping("/update/{id}/")
    public String getContract(@PathVariable("id")Integer id, Model model ) {
        //Modelに登録
        model.addAttribute("contract",service.getContract(id));
        //Contract更新画面に遷移
        return "contract/update";
    }

    /** Contract更新画面 */
    @PostMapping("/update/{id}/")
    public String PostContract(Contract contract) {
        //Contract登録
        service.saveContract(contract);
        //一覧画面にリダイレクト
        return "redirect:/contract/list";
    }
    //----追加：ここまで----
}
