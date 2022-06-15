import { configureStore } from '@reduxjs/toolkit';

import scrollReducer from './scroll-slice';
import projectsReducer from './projects-slice';

const store = configureStore({
    reducer: {
        scroll: scrollReducer,
        projects: projectsReducer,
        // navigation: navigationReducer,
        // main: mainReducer,
        // skills: skillsReducer,
    }
});

export default store;
export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;