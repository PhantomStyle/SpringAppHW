package PhantomStyle.dao;

import PhantomStyle.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService {

    @Autowired
    AccountDaoMock accountDaoMock;

    public void printAll() {
        accountDaoMock.getAll().stream()
                .forEach(e -> System.out.println(e.toString() + " "));
    }

    public void multiplyAll(Double multiplier) {
        accountDaoMock.getAll().stream()
                .forEach(e -> ((Account) e).setVolume(((Account) e).getVolume() * multiplier));
    }

    public void multiplyOwner(Long ownerId, Double multiplier) {
        accountDaoMock.getAll().stream()
                .forEach(e -> ((Account) e).setOwnerId((long) (((Account) e).getOwnerId() * multiplier)));
    }

    public double getTotalVolume() {
        final double[] ret = {0};
        accountDaoMock.getAll().stream()
                .forEach(e -> ret[0] += ((Account) e).getVolume());
        return ret[0];
    }

    public long getTotalOwnerVolume(Long ownerId) {
        final long[] ret = {0};
        accountDaoMock.getAll().stream()
                .forEach(e -> {
                    if (((Account) e).getOwnerId().equals(ownerId)) {
                        ret[0] += ((Account) e).getVolume();
                    }
                });
        return ret[0];
    }
}
