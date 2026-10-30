public class JumpingZombie extends Zombie {
  public JumpingZombie(int health, int level) {
    super(health, level);
  }

  @Override
  public void heal() {
    switch (getLevel()) {
      case 1: setHealth(getHealth() + getHealth() * 30 / 100); break;
      case 2: setHealth(getHealth() + getHealth() * 40 / 100); break;
      case 3: setHealth(getHealth() + getHealth() * 50 / 100); break;
    }
  }

  @Override
  public void destroyed() {
    setHealth(getHealth() - getHealth() * 10 / 100);
  }

  @Override
  public String getZombieInfo() {
    return "Jumping Zombie Data =\nHealth = " + getHealth() + "\nLevel = " + getLevel() + "\n";
  }
}
