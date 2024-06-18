package olympic.model.sport_type;

import olympic.model.Sport;

/**
 * generic
 */
public class generic extends Sport {
    /**
     * generic
     * 
     * @param Nom             String
     * @param Uniter          String
     * @param Coef_Force      double
     * @param Coef_Agilite    double
     * @param Coef_Endurance  double
     * @param Plus_haut_score boolean
     */
    public generic(String Nom, String Uniter, double Coef_Force, double Coef_Agilite,
            double Coef_Endurance, boolean Plus_haut_score) {
        super(Nom,
                Uniter,
                Coef_Force,
                Coef_Agilite,
                Coef_Endurance,
                Plus_haut_score);
    }
}