package fr.istic.master.aoc.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import fr.istic.master.aoc.diffusion.AlgoDiffusionFactory;
import fr.istic.master.aoc.diffusion.EnumAlgoDiffusion;
import fr.istic.master.aoc.generateur.interfaces.GenerateurAvecDiffusion;

/**
 * Panel recevant les boutons permettant de changer les stratégies de diffusion
 *  
 * @author michel & dorian
 *
 */
public class EspaceBoutons extends JPanel implements ActionListener {

	private static final long serialVersionUID = 3610406479192715806L;
	private GenerateurAvecDiffusion generateur;

	public EspaceBoutons(GenerateurAvecDiffusion generateur, GridLayout gridLayout) {
		super(gridLayout);
		this.generateur = generateur;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		generateur.setAlgoDiffusion(
				AlgoDiffusionFactory.build(Enum.valueOf(EnumAlgoDiffusion.class, e.getActionCommand())));
	}

}
