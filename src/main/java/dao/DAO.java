package dao;

public interface DAO<Entity, By> {

    Entity get(By by);
    void update(Entity entity);
    void delete(By by);
}
