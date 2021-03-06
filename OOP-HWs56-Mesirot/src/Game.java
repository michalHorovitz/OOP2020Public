import java.util.Random;

public class Game extends Thread {

	private static Random random = new Random();

	/*
	 * Determines the ratio between the simulated time and running time.
	 * Specifically, this number states how many milliseconds should the program
	 * wait to simulate one minute, if periods in the constructor to store are
	 * specified in minutes. Thus, if 'TIME_SIMULATION_FACTOR' is set to 1, a
	 * service time of 1 minutes will be simulated as 1 milliseconds, and a service
	 * time of 10 minutes will be simulated as 10 milliseconds.
	 * 
	 * A good value is 1000, making the simulation clock run 60 faster than the
	 * processes it simulates. Then a service time of 1 minutes(=60 seconds) will be
	 * simulated as 1000 milliseconds(=1 second). Simulating a 1-hour game should
	 * take 1 minute.
	 * 
	 * For example, to simulate that a thread is sleeping x minutes. You should use
	 * sleep(x*TIME_SIMULATION_FACTOR);
	 */
	public static final int TIME_SIMULATION_FACTOR = 1000;

	private Players players;
	private Ball ball;
	private Display display;
	private double playerActiveMean;
	private double playerActiveVar;
	private double playerArrivalMean;
	private double playerArrivalVar;

	/**
	 * Constructor
	 *
	 */
	public Game(long timeForGameM, int numPlayers, double playerActiveMean, double playerActiveVar,
			double playerArrivalMean, double playerArrivalVar) throws Exception {
		// TODO - add your implementation
	}

	public void run() {
		// TODO - add your implementation
	}

	/**
	 * gaussian - compute a random number drawn from a normal (Gaussian)
	 * distribution
	 *
	 * @param periodMean
	 *            - the mean of the distribution
	 * @param periodVar
	 *            - the variance of the distribution
	 * @return
	 */
	public static double gaussian(double periodMean, double periodVar) {
		double period = 0;
		while (period < 1)
			period = periodMean + periodVar * random.nextGaussian();
		return period;
	}

}
