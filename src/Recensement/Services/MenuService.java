package Recensement.Services;

import Recensement.Entities.Recensement;

import java.util.Scanner;

abstract public class MenuService {
    public abstract void traiter(Recensement recensement, Scanner scanner);
}
