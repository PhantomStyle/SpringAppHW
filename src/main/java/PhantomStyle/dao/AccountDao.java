package PhantomStyle.dao;

import PhantomStyle.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> getAll();

    Account getById(Long id);

    List<Account> getByOwner(Long ownerId);
}
