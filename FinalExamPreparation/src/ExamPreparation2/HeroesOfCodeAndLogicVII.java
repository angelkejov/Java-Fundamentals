package ExamPreparation2;

import java.util.*;

public class HeroesOfCodeAndLogicVII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> heroesMp = new TreeMap<>();
        Map<String, Integer> heoresHp = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();
            String[] split = input.split("\\s+");
            String heroName = split[0];
            int hp = Integer.parseInt(split[1]);
            int mp = Integer.parseInt(split[2]);

            if (hp <= 100) {
                heoresHp.put(heroName, hp);
            }
            if (mp <= 200) {
                heroesMp.put(heroName, mp);
            }
        }

        while (true) {
            String command = sc.nextLine();
            if (command.equals("End")) {
                break;
            }
            String[] tokens = command.split(" - ");
            String commandName = tokens[0];
            String heroName = tokens[1];
            switch (commandName) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    int currentMp = heroesMp.get(heroName);
                    if(currentMp >= mpNeeded) {
                        int mpLeft = currentMp - mpNeeded;
                        heroesMp.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s" +
                                " and now has %d MP!%n", heroName, spellName, mpLeft);
                    }
                    else {
                        System.out.printf("%s does not have enough MP" +
                                " to cast %s!%n", heroName, spellName);
                    }
                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    int currentHp = heoresHp.get(heroName);
                    int leftHp = currentHp - damage;
                    if(leftHp > 0) {
                        heoresHp.put(heroName, leftHp);
                        System.out.printf("%s was hit for %d HP by %s " +
                                "and now has %d HP left!%n", heroName,
                                damage, attacker, leftHp);
                    }
                    else {
                        System.out.printf("%s has been killed by %s!%n",
                                heroName, attacker);
                        heoresHp.remove(heroName);
                        heroesMp.remove(heroName);
                    }
                    break;

                case "Recharge":
                    int amountRecharge = Integer.parseInt(tokens[2]);
                    int currentMpForRecharge = heroesMp.get(heroName);
                    int increaseMP = currentMpForRecharge + amountRecharge;
                    if(increaseMP > 200) {
                        increaseMP = 200;
                    }
                    heroesMp.put(heroName, increaseMP);
                    System.out.printf("%s recharged for %d MP!%n",
                            heroName, increaseMP - currentMpForRecharge);
                    break;

                case "Heal":
                    int amountHeal = Integer.parseInt(tokens[2]);
                    int currentHPForHeal = heoresHp.get(heroName);
                    int increasedHP = currentHPForHeal + amountHeal;
                    if(increasedHP > 100) {
                        increasedHP = 100;
                    }
                    heoresHp.put(heroName, increasedHP);
                    System.out.printf("%s healed for %d HP!%n", heroName,
                            increasedHP - currentHPForHeal);
                    break;
            }
        }
        heoresHp.entrySet().stream()
                .sorted((h1, h2) -> Integer.compare(h2.getValue(), h1.getValue()))
                .forEach(heroEntry -> {
                    String heroName = heroEntry.getKey();
                    System.out.println(heroName);
                    System.out.println("  HP: " + heroEntry.getValue());
                    System.out.println("  MP: " + heroesMp.get(heroName));
                });
    }
}
