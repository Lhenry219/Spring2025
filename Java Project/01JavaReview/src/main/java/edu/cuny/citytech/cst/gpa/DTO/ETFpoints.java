<<<<<<< HEAD
package edu.cuny.citytech.cst.gpa.DTO;

import edu.cuny.citytech.cst.gpa.GPA;
import edu.cuny.citytech.cst.gpa.StocksLetterGrade;
import edu.cuny.citytech.utility.CSTFunction;

public class ETFpoints extends ETF {

	private ETF etf;
	public ETFpoints(ETF etf) {
		this.etf=etf;
	}
	protected float expensesScore;
	protected float dividendScore;
	protected float riskScore;
	protected float liquidityScore;
	
	public float getExpensesScore() {
		return StocksLetterGrade.getQPA(etf.expenses);
	}

	public float getDividendScore() {
		return StocksLetterGrade.getQPA(etf.dividends);
	}

	public float getRiskScore() {
		return StocksLetterGrade.getQPA(etf.risk);
	}

	public float getLiquidityScore() {
		return StocksLetterGrade.getQPA(etf.liquidity);
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ETF [rank=");
		builder.append(etf.rank);
		builder.append(", symbol=");
		builder.append(etf.symbol);
		builder.append(", aum=");
		builder.append(etf.aum);

		builder.append(", dividends=");
		builder.append(etf.dividends);
		builder.append(":");
		builder.append(this.getDividendScore());

		builder.append(", liquidity=");
		builder.append(etf.liquidity);
		builder.append(":");
		builder.append(this.getLiquidityScore());

		builder.append(", risk=");
		builder.append(etf.risk);
		builder.append(":");
		builder.append(this.getRiskScore());

		builder.append(", expenses=");
		builder.append(etf.expenses);
		builder.append(":");
		builder.append(this.getExpensesScore());

		builder.append(", yield=");
		builder.append(etf.yield);

		builder.append(", frequency=");
		builder.append(etf.frequency);
		builder.append("]");

		return builder.toString();


	}
}
=======
package edu.cuny.citytech.cst.gpa.DTO;

import edu.cuny.citytech.cst.gpa.GPA;
import edu.cuny.citytech.cst.gpa.StocksLetterGrade;
import edu.cuny.citytech.utility.CSTFunction;

public class ETFpoints extends ETF {

	private ETF etf;
	public ETFpoints(ETF etf) {
		this.etf=etf;
	}
	protected float expensesScore;
	protected float dividendScore;
	protected float riskScore;
	protected float liquidityScore;
	
	public float getExpensesScore() {
		return StocksLetterGrade.getQPA(etf.expenses);
	}

	public float getDividendScore() {
		return StocksLetterGrade.getQPA(etf.dividends);
	}

	public float getRiskScore() {
		return StocksLetterGrade.getQPA(etf.risk);
	}

	public float getLiquidityScore() {
		return StocksLetterGrade.getQPA(etf.liquidity);
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ETF [rank=");
		builder.append(etf.rank);
		builder.append(", symbol=");
		builder.append(etf.symbol);
		builder.append(", aum=");
		builder.append(etf.aum);

		builder.append(", dividends=");
		builder.append(etf.dividends);
		builder.append(":");
		builder.append(this.getDividendScore());

		builder.append(", liquidity=");
		builder.append(etf.liquidity);
		builder.append(":");
		builder.append(this.getLiquidityScore());

		builder.append(", risk=");
		builder.append(etf.risk);
		builder.append(":");
		builder.append(this.getRiskScore());

		builder.append(", expenses=");
		builder.append(etf.expenses);
		builder.append(":");
		builder.append(this.getExpensesScore());

		builder.append(", yield=");
		builder.append(etf.yield);

		builder.append(", frequency=");
		builder.append(etf.frequency);
		builder.append("]");

		return builder.toString();


	}
}
>>>>>>> 579b0bf1a55d39c60fe7beceaa336e584357bda4
