package PhantomStyle.dao;

import PhantomStyle.domain.Account;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AccountDaoMock implements AccountDao {
    private final Map<Long, Account> accounts;

    public AccountDaoMock() {
        accounts = new HashMap<>();
        accounts.put(1L, new Account(1L, "Kesha", 10L, 5.0));
        accounts.put(2L, new Account(2L, "Grisha", 20L, 10.0));
        accounts.put(3L, new Account(3L, "Tanya", 30L, 15.0));
        accounts.put(4L, new Account(4L, "Lena", 10L, 25.0));
    }

    public List getAll() {
        return Arrays.asList(accounts.values().toArray());
    }

    public Account getById(Long id) {
        final Account[] account = new Account[1];
        accounts.entrySet().stream()
                .forEach(e -> {
                    if (e.getValue().getId().equals(id)) {
                        account[0] = e.getValue();
                    }
                });
        return account[0];
    }

    public Account getByOwner(String owner) {
        final Account[] account = new Account[1];
        accounts.entrySet().stream()
                .forEach(e -> {
                    if (e.getValue().getOwnerId().equals(owner)) {
                        account[0] = e.getValue();
                    }
                });
        return account[0];
    }
}
