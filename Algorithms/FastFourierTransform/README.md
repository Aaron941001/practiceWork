In this example, we first generate an array of samples using a sample rate of 44100 samples per second. We then use the numpy.fft.fft() function to perform the FFT on the samples. The fft_output variable will be an array of complex numbers representing the frequency spectrum of the signal. Finally, we use np.abs() to get the absolute values of the complex numbers, which will give us the magnitude of the frequency spectrum.

You can also adjust the window function and the size of the transform. By default, it's using the Hanning window function and the length of the input signal. You can use other window functions such as Hamming, Blackman, rectangular, etc, and adjust the size of the transform using numpy.fft.fft(samples,n) where n is the size of the FFT.

It's also worth noting that the FFT output will be symmetric about the Nyquist frequency. Therefore, it's common to take only the first half of the output and multiply it by 2 to get the actual amplitude of the frequency components.

using FFT example:
Signal processing: One of the most common applications of FFT is in signal processing. For example, you can use FFT to analyze audio signals to identify different frequency components in the signal, such as bass, mid-range, and treble. With this information, you can then adjust the audio to improve its quality or remove unwanted noise.

Image processing: FFT can also be used in image processing to analyze the frequency components of an image. For example, you can use FFT to identify the edges in an image by looking at the high-frequency components of the image. This technique is used in image compression and denoising.

Spectral analysis: FFT can be used to analyze time-series data, such as stock prices or weather data. It can help to identify patterns in the data that may not be immediately visible by looking at the raw data. This technique is called spectral analysis.

Medical imaging: In medical imaging, FFT can be used to analyze signals from Magnetic Resonance Imaging (MRI) or Computer Tomography (CT) scans. It can help to identify different tissue types, such as healthy tissue and tumors, based on their different frequency characteristics.

Control Systems: FFT can also be used to analyze the frequency content of the signals in control systems. This information can be used to design control systems that can filter out unwanted frequency components, such as noise, and improve the system's performance.

These are just a few examples of how FFT can be used in a practical way. The FFT algorithm is widely used in many fields such as telecommunications, physics, engineering, and signal processing.