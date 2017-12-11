package br.edu.univas.si8.ta.fcalc.core;

import br.edu.univas.si8.ta.fcalc.api.FCalcService;
import br.edu.univas.si8.ta.fcalc.api.Result;
import br.edu.univas.si8.ta.fcalc.lib.FCalcImpl;

public class FCalcServiceImpl implements FCalcService {

	@Override
	public Result fibcalc(int num) {
		int fibonacci = FCalcImpl.fibonacci(num);
		return new Result().FNumber(num).withFibonacci(fibonacci);
	}

}
