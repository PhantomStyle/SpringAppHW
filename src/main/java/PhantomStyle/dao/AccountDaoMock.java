package PhantomStyle.dao;

import PhantomStyle.domain.Account;
import org.springframework.stereotype.Component;

import java.util.*;

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

    public List<Account> getAll() {
        return new ArrayList<>(accounts.values());
    }

    public Account getById(Long id) {
        return accounts.get(id);
    }

    public Account getByOwner(Long ownerId) {
        return accounts.entrySet().stream()
                .filter(e -> e.getValue().getOwnerId().equals(ownerId))
                .findAny().get().getValue();
    }
}
