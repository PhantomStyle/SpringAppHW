package PhantomStyle.domain;

public class Account {
    Long id;
    String name;
    Long ownerId;
    Double volume;

    public Account(Long id, String name, Long ownerId, Double volume) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", volume=" + volume +
                '}';
    }
}
