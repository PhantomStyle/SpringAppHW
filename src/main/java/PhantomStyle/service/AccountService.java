package PhantomStyle.service;

import PhantomStyle.dao.AccountDao;
import PhantomStyle.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService {

    @Autowired
    AccountDao accountDao;

    public void printAll() {
        accountDao.getAll().stream()
                .forEach(e -> System.out.println(e.toString() + " "));
    }

    public void multiplyAll(Double multiplier) {
        accountDao.getAll().stream()
                .forEach(e -> e.setVolume(e.getVolume() * multiplier));
    }

    public void multiplyOwner(Long ownerId, Double multiplier) {
        accountDao.getAll().stream()
                .forEach(e -> e.setOwnerId((long) (e.getOwnerId() * multiplier)));
    }

    public double getTotalVolume() {
        return accountDao.getAll().stream()
                .mapToDouble(Account::getVolume)
                .sum();
    }

    public double getTotalOwnerVolume(Long ownerId) {
        final long[] ret = {0};
        return accountDao.getAll().stream()
                .filter(e -> e.getOwnerId().equals(ownerId))
                .mapToDouble(Account::getVolume)
                .sum();
    }
}
