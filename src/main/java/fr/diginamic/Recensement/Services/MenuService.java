package fr.diginamic.Recensement.Services;

import fr.diginamic.Recensement.Entities.Recensement;

import java.util.Scanner;

abstract public class MenuService {
    public abstract void traiter(Recensement recensement, Scanner scanner);
}
