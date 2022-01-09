package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковской системы для работы с пользователями и их счетами
 * @author YURIY FROLOV
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователя осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет его в систему
     * @param user пользователь который добавляется в очередь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет пользователю.
     * В методе проходит проверка на наличие у пользоваетля добавляемого счета.
     * Если счета нет добавляется.
     * @param passport паспорт пользователя, которому необходимо добавить счет
     * @param account счет, который необходимо добавить
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     * @param passport паспорт, по которому необходимо найти пользователя
     * @return если ничего не найдено - метод возвращает null
     */
    public User findByPassport(String passport) {
        for (User user: users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport паспорт, по которому необходимо найти пользователя
     * @param requisite реквизиты, по которым необходимо найти счет пользователя
     * @return если ничего не найдено - метод возвращает null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account: users.get(user)) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт.
     * @param srcPassport паспорт, по которому необходимо найти пользователя отправителя
     * @param srcRequisite реквизиты, по которым необходимо найти счет пользователя отправителя
     * @param destPassport паспорт, по которому необходимо найти пользователя получателя
     * @param destRequisite реквизиты, по которым необходимо найти счет пользователя получателя
     * @param amount сумма перевода
     * @return Если счёт не найден или не хватает денег на счёте, то метод возвращает false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
