package terty.thirst.api;

public interface DrinkableFluidStatProvider {

	/** @return the amount of satisfaction provided per bucket of the liquid consumed. */
	int getSatisfaction();

	/** @return the amount of saturation provided per bucket of the liquid consumed. */
	float getSaturation();

}
