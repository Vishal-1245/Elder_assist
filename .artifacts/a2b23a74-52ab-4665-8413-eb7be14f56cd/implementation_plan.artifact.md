# Fix "Unresolved reference 'Profile'" Error

The error `Unresolved reference 'Profile'` occurs because the `Routes` sealed class is missing the `Profile` object, which is being used in `DrawerMenu.kt` and `TopBar.kt`. Additionally, the navigation graph in `AppNavigation.kt` is missing the composable for the `Profile` screen.

## Proposed Changes

### Navigation

#### [MODIFY] [Routes.kt](file:///C:/Users/VISHAL%20REDDY/AndroidStudioProjects/Voiceassist/app/src/main/java/com/example/voiceassist/ui/frontend/navigation/Routes.kt)
- Add `object Profile : Routes("profile")` to the `Routes` sealed class.

#### [MODIFY] [AppNavigation.kt](file:///C:/Users/VISHAL%20REDDY/AndroidStudioProjects/Voiceassist/app/src/main/java/com/example/voiceassist/ui/frontend/navigation/Appnavigation.kt)
- Add a composable entry for `Routes.Profile.route` that navigates to `ProfileScreen`.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:compileDebugKotlin` to verify that the unresolved reference error is resolved and the project builds successfully.

### Manual Verification
- Deploy the app and verify that clicking the "Profile" item in the drawer or top bar correctly navigates to the Profile screen.
