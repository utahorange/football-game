import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Entity
{
    public Enemy(int type,int health, int atk, int speed, int reloadSpeed){
        super(type,health, atk, speed, reloadSpeed);
        setImage("enemy.png");
    }
    
    public void fire(){
        if (reloadDelayCount == getReloadTime()){
            Bullet bullet = new Bullet(type,atk,getMovement().copy(), getRotation());
            getWorld().addObject(bullet, getX(), getY());
            bullet.move ();
            reloadDelayCount = 0;
        }
    }
    public void isDead(){
        if(getHealth()<=0){
            setImage("dead.png");
            getEnemyArray().remove(
        }
    }
    
    public void act() 
    {
        isDead();
    }
}
