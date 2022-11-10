package com.akshaw.drinkreminder.feature_onboarding.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akshaw.drinkreminder.R
import com.akshaw.drinkreminder.core.domain.model.Gender
import com.akshaw.drinkreminder.feature_onboarding.presentation.OnboardingEvent
import com.akshaw.drinkreminder.feature_onboarding.presentation.OnboardingViewModel

@Composable
fun SelectGender(viewModel: OnboardingViewModel, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        GenderSelectable(
            text = stringResource(id = R.string.female),
            drawableRes = R.drawable.ic_icon_awesome_female,
            isSelected = viewModel.state.gender is Gender.Female,
            color = MaterialTheme.colorScheme.secondary.copy(alpha = .15f),
            selectedColor = MaterialTheme.colorScheme.secondary.copy(alpha = .5f),
            onClick = {
                viewModel.onEvent(OnboardingEvent.OnGenderClick(Gender.Female))
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            textStyle = TextStyle(
                color = MaterialTheme.colorScheme.onSecondary,
                fontFamily = FontFamily(
                    Font(
                        R.font.ubuntu_medium,
                        FontWeight.Medium
                    )
                ),
                fontSize = 20.sp
            )
        )
        Spacer(modifier = Modifier.height(24.dp))
        GenderSelectable(
            text = stringResource(id = R.string.male),
            drawableRes = R.drawable.ic_icon_awesome_male,
            isSelected = viewModel.state.gender is Gender.Male,
            color = MaterialTheme.colorScheme.secondary.copy(alpha = .15f),
            selectedColor = MaterialTheme.colorScheme.secondary.copy(alpha = .5f),
            onClick = {
                viewModel.onEvent(OnboardingEvent.OnGenderClick(Gender.Male))
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            textStyle = TextStyle(
                color = MaterialTheme.colorScheme.onSecondary,
                fontFamily = FontFamily(
                    Font(
                        R.font.ubuntu_medium,
                        FontWeight.Medium
                    )
                ),
                fontSize = 20.sp
            )
        )
    }
}