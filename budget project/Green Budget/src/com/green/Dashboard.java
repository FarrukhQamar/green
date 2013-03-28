/*
   Green Budget is income and expense tracking software
   Copyright (C) 2013  Damith Wanninayake

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 
 */

package com.green;

import com.green.common.Common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Dashboard extends Activity {
	private Button btnIncome;
	private Button btnExpenses;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);

		ViewGroup root = (ViewGroup) findViewById(R.id.outerMainLayout);
		Common.setFont(root, Common.getHeaderTypeFace(getApplicationContext()));

		btnIncome = (Button) findViewById(R.id.btnIncome);
		btnExpenses = (Button) findViewById(R.id.btnExpenses);

		btnIncome.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				Intent incomes = new Intent(getApplicationContext(),
						Incomes.class);
				startActivity(incomes);

			}
		});
		
		btnExpenses.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				Intent expenses = new Intent(getApplicationContext(),
						Expenses.class);
				startActivity(expenses);

			}
		});
	}
}
